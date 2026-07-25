import React from "react";

function ListofPlayers() {
  const players = [
    { name: "Smith", score: 83 },
    { name: "Devilliers", score: 102 },
    { name: "Stokes", score: 59 },
    { name: "Marsh", score: 75 },
    { name: "Rusell", score: 79 },
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 88 },
    { name: "Gill", score: 65 },
    { name: "Rahul", score: 55 },
    { name: "Pant", score: 78 },
    { name: "Hardik", score: 45 },
    { name: "Jadeja", score: 72 },
    { name: "Bumrah", score: 30 },
    { name: "Shami", score: 60 },
    { name: "Surya", score: 84 },
    { name: "Ishan", score: 68 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>

      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h2>Players with Score Below 70</h2>

      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;