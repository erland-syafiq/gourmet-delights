import React from 'react';
import { Link } from 'react-router-dom';
import './Navbar.css';

const NavBar = () => {
    return (
        <nav className="navbar">
            <div className="navbar-left">
                <Link to="/" className="navbar-title">Gourmet Delights</Link>
            </div>
            <div className="navbar-right">
                <Link to="/search" className="navbar-link">Search</Link>
            </div>
        </nav>
    );
};

export default NavBar;

