import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';
import './App.css';
function App() {

  const courses=[
    {id:1,name:"Angular",date:"4/5/2021"},
    {id:2,name:"React",date:"20/6/2023"}
  ];

  const books=[
    {id:101,title:"Master React", price:670},
    {id:102,title:"Designing Data intensive Application",price:1400},
    {id:1034,title:"Deep Dive into Angualr 11",price:800}
  ];

  const blogs=[
    {
      id: 1,
      title: "React Learning",
      author: "Stephen Biz",
      text: "Welcome to learning React!"
    },
    {
      id: 2,
      title: "Installation",
      author: "Schewzdenier",
      text: "You can install React from npm."
    }
  ];

  return (
    <>
    <div style={{textAlign:"center",color:"mediumpurple",marginTop:"50px"}}>
      <h1>Blogger App</h1>
    </div>
    <div className="app">
      <CourseDetails courses={courses}/>
      <BookDetails books={books}/>
      <BlogDetails blogs={blogs}/>
    </div>
    </>
  );
}

export default App;
