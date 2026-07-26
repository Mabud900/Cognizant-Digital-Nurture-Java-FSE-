import React from "react";

function BookDetails({ books }) {
  let content;

  if (books.length > 0) {
    content = books.map((book) => (
      <div key={book.id} className="item">
        <h3>{book.title}</h3>
        <p>{book.price}</p>
      </div>
    ));
  } else {
    content = <p>No books found</p>;
  }

  return (
    <div className="box">
      <h2>Book Details</h2>
      {content}
    </div>
  );
}

export default BookDetails;