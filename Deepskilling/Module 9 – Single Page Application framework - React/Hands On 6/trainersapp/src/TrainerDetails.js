import { useParams, Link } from 'react-router-dom';
import trainersData from './TrainersMock';

function TrainerDetail() {
  const { id } = useParams();
  const trainer = trainersData.find((t) => String(t.trainerId) === id);

  if (!trainer) {
    return (
      <div className="trainer-detail">
        <p>Trainer not found.</p>
        <Link to="/trainers">Back to Trainers List</Link>
      </div>
    );
  }

  return (
    <div className="trainer-detail">
      <h2>{trainer.name}</h2>
      <p><strong>ID:</strong> {trainer.trainerId}</p>
      <p><strong>Email:</strong> {trainer.email}</p>
      <p><strong>Phone:</strong> {trainer.phone}</p>
      <p><strong>Technology:</strong> {trainer.technology}</p>
      <p><strong>Skills:</strong> {trainer.skills.join(', ')}</p>
      <Link to="/trainers">Back to Trainers List</Link>
    </div>
  );
}

export default TrainerDetail;