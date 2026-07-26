import axios from 'axios';
import GitClient from './GitClient';

jest.mock('axios');

describe('Git Client Tests', () => {
  test('should return repository names for techiesyed', async () => {
    const mockData = {
      data: [
        { name: 'repo-one' },
        { name: 'repo-two' },
        { name: 'repo-three' }
      ]
    };

    axios.get.mockResolvedValue(mockData);

    const gitClient = new GitClient();
    const result = await gitClient.getRepositories('techiesyed');

    expect(axios.get).toHaveBeenCalledWith(
      'https://api.github.com/users/techiesyed/repos'
    );
    expect(result).toEqual(['repo-one', 'repo-two', 'repo-three']);
  });
});