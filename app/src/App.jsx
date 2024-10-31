import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import HomePage from './pages/HomePage';
import SearchPage from './pages/SearchPage';

const App = () => {
    return (
        <Router>
            <nav>
                <Link to="/">Home</Link> | <Link to="/search">Search</Link>
            </nav>

            <Routes>
                <Route path="/" element={<HomePage />} />
                <Route path="/search" element={<SearchPage />} />
            </Routes>
        </Router>
    );
};

export default App;