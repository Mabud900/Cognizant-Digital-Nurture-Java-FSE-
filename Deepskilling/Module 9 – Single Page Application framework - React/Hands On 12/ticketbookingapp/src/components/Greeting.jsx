import GuestPage from '../GuestPage';
import UserPage from '../UserPage';

function Greeting(props){
    return props.isLoggedIn ? <UserPage/>:<GuestPage/>; 
}
export default Greeting;