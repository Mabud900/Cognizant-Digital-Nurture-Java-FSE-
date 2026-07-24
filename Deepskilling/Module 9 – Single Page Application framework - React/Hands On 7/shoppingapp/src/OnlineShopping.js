import React, {Component} from 'react';
import Cart from './Cart';

class OnlineShopping extends Component{
    constructor(){
        super();

        this.item=[
            {itemname:"Mobile",price:15000},
            {itemname:"Laptop",price:55000},
            {itemname:"HeadPhone",price:2000},
            {itemname:"Keyboard",price:1200},
            {itemname:"Mouse",price:800}
        ];
    }
    render(){
        return(
            <div style={{textAlign:'center',color:'green'}}>
                <h1 >Items Ordered:</h1>
                <Cart item={this.item}/>
            </div>
        );
    }
}
export default OnlineShopping;