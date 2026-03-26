package com.example.bookstore.controller;

import com.example.bookstore.Book;
import com.example.bookstore.repository.BookRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books-ui")
public class BookUIController {

    @Autowired
    private BookRepository bookRepository;

    // Show all books
    @GetMapping
    public String getBooksUI(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books"; // templates/books.html
    }

    // Show form to add new book
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        return "form";
    }

    // Show form to edit existing book
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid book Id: " + id));
        model.addAttribute("book", book);
        return "form";
    }

    // Save book (add or update)
    @PostMapping("/save")
    public String saveBook(@Valid @ModelAttribute Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        bookRepository.save(book);
        return "redirect:/books-ui";
    }

    // Delete book
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "redirect:/books-ui";
    }
}
