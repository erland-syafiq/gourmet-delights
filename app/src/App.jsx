import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import HomePage from './pages/HomePage';
import SearchPage from './pages/SearchPage';
import NavBar from './components/Navbar/Navbar';

const App = () => {
    return (
        <Router>
            <NavBar />

            <Routes>
                <Route path="/" element={<HomePage />} />
                <Route path="/search" element={<SearchPage />} />
            </Routes>
        </Router>
    );
};

export default App;
