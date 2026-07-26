import React, { Component } from 'react';
import GitClient from './GitClient';

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      repositories: []
    };

    this.gitClient = new GitClient();
  }

  componentDidMount() {
    this.gitClient.getRepositories('techiesyed').then((data) => {
      this.setState({
        repositories: data
      });
    });
  }

  render() {
    return (
      <div style={{ textAlign: 'center' }}>
        <h2>GitHub Repositories</h2>

        <ul style={{ listStyleType: 'none', padding: 0 }}>
          {this.state.repositories.map((repo, index) => (
            <li key={index}>{repo}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default App;