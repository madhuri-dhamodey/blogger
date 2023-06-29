//package md.practice.blogger.controller;
//import md.practice.blogger.model.Blog;
//import md.practice.blogger.service.BlogService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/blogs")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//public class BlogRestController {
//
//    @Autowired
//    private BlogService blogService;
//
//    @GetMapping
//    public ResponseEntity<List<Blog>> getAllBlogs() {
//        List<Blog> blogs = blogService.getAllBlogs();
//        return ResponseEntity.ok(blogs);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Blog> getBlogById(@PathVariable Long id) {
//        Blog blog = blogService.getBlogById(id);
//        if (blog != null) {
//            return ResponseEntity.ok(blog);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog) {
//        Blog createdBlog = blogService.createBlog(blog);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdBlog);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Blog> updateBlog(@PathVariable Long id, @RequestBody Blog blog) {
//        Blog updatedBlog = blogService.updateBlog(id, blog);
//        if (updatedBlog != null) {
//            return ResponseEntity.ok(updatedBlog);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteBlog(@PathVariable Long id) {
//        boolean deleted = blogService.deleteBlog(id);
//        if (deleted) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//}
