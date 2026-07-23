import React from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainersList from './Trainerlist';
import TrainerDetail from './TrainerDetails';
import trainersMock from './TrainersMock';

function App() {
  return (
    <BrowserRouter>
  <div style={{ padding: '20px' }}>

    <h1>My Academy Trainers App</h1>

    <Link to="/">Home</Link>{" | "}
    <Link to="/trainers">Show Trainers</Link>

    <Routes>
      <Route path="/" element={<Home />} />
      <Route
        path="/trainers"
        element={<TrainersList trainers={trainersMock} />}
      />
      <Route path="/trainer/:id" element={<TrainerDetail />} />
    </Routes>

  </div>
</BrowserRouter>
  );
}

export default App;