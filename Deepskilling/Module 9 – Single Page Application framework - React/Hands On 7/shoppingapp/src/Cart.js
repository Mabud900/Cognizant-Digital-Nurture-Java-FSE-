import React, { Component } from 'react';
import './Cart.css'

class Cart extends Component {
  render() {
    return (
      <div style={{ textAlign: 'center' }}>
  <div className="cart-container">
    <table
      border="1"
      style={{
        margin: '0 auto',
        borderCollapse: 'collapse'
      }}
    >
      <thead>
        <tr>
          <th>Name</th>
          <th>Price</th>
        </tr>
      </thead>

      <tbody>
        {this.props.item.map((item, index) => (
          <tr key={index}>
            <td>{item.itemname}</td>
            <td>{item.price}</td>
          </tr>
        ))}
      </tbody>
    </table>
  </div>
</div>
    );
  }
}

export default Cart;