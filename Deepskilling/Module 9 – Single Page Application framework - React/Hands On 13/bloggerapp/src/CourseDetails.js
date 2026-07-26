import React from "react";

function CourseDetails({ courses }) {
  return (
    <div className="box">
      <h2>Course Details</h2>

      {courses.length > 0 ? (
        courses.map((course) => (
          <div key={course.id} className="item">
            <h3>{course.name}</h3>
            <p>{course.date}</p>
          </div>
        ))
      ) : (
        <p>No courses found</p>
      )}
    </div>
  );
}

export default CourseDetails;