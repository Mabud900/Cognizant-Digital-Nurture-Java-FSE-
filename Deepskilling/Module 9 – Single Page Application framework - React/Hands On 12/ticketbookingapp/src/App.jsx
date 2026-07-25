import { Component } from "react";
import Greeting from "./components/Greeting";
import LoginButton from "./components/LoginButton";
import LogoutButton from "./components/LogoutButton";

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false,
    };
  }

  handleLoginClick = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogoutClick = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    let button;

    if (this.state.isLoggedIn) {
      button = (
        <LogoutButton
          onClick={this.handleLogoutClick}
        />
      );
    } else {
      button = (
        <LoginButton
          onClick={this.handleLoginClick}
        />
      );
    }

    return (
      <div style={{ textAlign: "center" }}>
        <Greeting
          isLoggedIn={this.state.isLoggedIn}
        />

        {button}
      </div>
    );
  }
}

export default App;