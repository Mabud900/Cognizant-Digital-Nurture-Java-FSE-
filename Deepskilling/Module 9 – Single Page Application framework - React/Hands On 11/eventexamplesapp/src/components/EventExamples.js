import React, { Component } from 'react';

class EventExamples extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
    };
  }

  increment = () => {
    this.setState((prevState) => ({
      counter: prevState.counter + 1,
    }));
  };

  decrement = () => {
    this.setState((prevState) => ({
      counter: prevState.counter - 1,
    }));
  };

  sayHello = () => {
    alert("Hello User!");
  };

  handleIncrementClick = () => {
    this.increment();
    this.sayHello();
  };

  sayWelcome = (message) => {
    alert(`Welcome ${message}`);
  };

  handlePress = (event) => {
    alert("I was Clicked");
    console.log("Synthetic event", event);
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "40px" }}>
        <h1>Counter: {this.state.counter}</h1>
        <button onClick={this.handleIncrementClick}>Increment</button>
        <button onClick={this.decrement} style={{ marginLeft: "10px" }}>
          Decrement
        </button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome")}>Say Welcome</button>

        <br /><br />
        <button onClick={this.handlePress}>OnPress</button>
      </div>
    );
  }
}

export default EventExamples;