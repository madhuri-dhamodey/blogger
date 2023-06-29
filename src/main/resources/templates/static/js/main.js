// JavaScript code for the blog list page using jQuery
$(document).ready(function() {
    $.ajax({
        url: '/blogs',
        method: 'GET',
        dataType: 'json',
                  cors: true ,
                  contentType:'application/json',
                  headers: {
                    'Access-Control-Allow-Origin': '*',
                  },
        success: function(blogs) {
            const blogsContainer = $('#blogs-container');
            blogs.forEach(function(blog) {
                const blogItem = createBlogItem(blog);
                blogsContainer.append(blogItem);
            });
        },
        error: function(xhr, status, error) {
            console.error('Error fetching blogs:', error);
        }
    });
});

function createBlogItem(blog) {
    const blogItem = $('<div>').addClass('blog-item');

    const title = $('<h2>').text(blog.title);

    const content = $('<p>').text(blog.content);

    blogItem.append(title, content);

    return blogItem;
}
