import React from "react";

function BlogDetails({ blogs }) {
  return (
    <div className="box">
      <h2>Blog Details</h2>

      {blogs.length > 0 && (
        blogs.map((blog) => (
          <div key={blog.id} className="item">
            <h3>{blog.title}</h3>
            <p>{blog.author}</p>
            <p>{blog.text}</p>
          </div>
        ))
      )}
    </div>
  );
}

export default BlogDetails;