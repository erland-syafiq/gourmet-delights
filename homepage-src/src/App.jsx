import React from 'react';
import './App.css';
import Login from './components/Login/Login';
import SearchBar from './components/SearchBar/SearchBar';

function App() {
  return (
    <div className="App">
      <div className="top-bar">
        <h1>Gourmet Delights</h1>
        <Login /> {/* login */}
      </div>
      <div className="content">
        <p className="intro-text">Find recipes from the ingredients you already have. Save money and be more sustainable! From quick weeknight dinners to elaborate holiday feasts, we have something for everyone. Browse through our recipes:</p>
        <SearchBar /> {/* search bar */}
      </div>
    </div>
  );
}

export default App;
