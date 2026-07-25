import React from "react";

function App() {
  const officeSpaces = [
    {
      name: "Tech Park Office",
      rent: 55000,
      address: "Bangalore",
      image:
        "https://images.unsplash.com/photo-1497366754035-f200968a6e72"
    },
    {
      name: "Business Hub",
      rent: 75000,
      address: "Hyderabad",
      image:
        "https://images.unsplash.com/photo-1497366412874-3415097a27e7"
    },
    {
      name: "Corporate Tower",
      rent: 65000,
      address: "Pune",
      image:
        "https://images.unsplash.com/photo-1497366216548-37526070297c"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space , At Affordable Range</h1>

      {officeSpaces.map((office, index) => (
        <div key={index} style={{ marginBottom: "30px" }}>
          <img
            src={office.image}
            alt={office.name}
            width="300"
            height="200"
          />

          <h2>{office.name}</h2>

          <h3
            style={{
              color: office.rent < 60000 ? "red" : "green"
            }}
          >
            Rent: ₹{office.rent}
          </h3>

          <h3>Address: {office.address}</h3>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;