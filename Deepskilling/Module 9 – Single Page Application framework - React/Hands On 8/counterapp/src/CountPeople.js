import React, { Component } from "react";
import "./CountPeople.css";

class CountPeople extends Component {
  constructor(props) {
    super(props);

    this.state = {
      entrycount: 0,
      exitcount: 0
    };
  }

  UpdateEntry = () => {
    this.setState({
      entrycount: this.state.entrycount + 1
    });
  };

  UpdateExit = () => {
    this.setState({
      exitcount: this.state.exitcount + 1
    });
  };

  render() {
    return (
      <div className="container">
  <h1 className="heading">Mall Entry Counter</h1>

  <div className="counter-section">
    <button className="btn" onClick={this.UpdateEntry}>
      Login
    </button>

    <h2 className="count">
      People Entered: {this.state.entrycount}
    </h2>
  </div>

  <div className="counter-section">
    <button className="btn" onClick={this.UpdateExit}>
      Exit
    </button>

    <h2 className="count">
      People Exited: {this.state.exitcount}
    </h2>
  </div>
</div>
    );
  }
}

export default CountPeople;