import React from 'react';
import './SearchBar.css'; //  SearchBar 

function SearchBar() {
  const handleSearchClick = () => {
    window.open('about:blank', '_blank'); // open new page
  };

  return (
    <div className="search-area">
      <input type="text" className="search-bar" placeholder="Search recipes..." />
      <button className="search-button" onClick={handleSearchClick}>Search</button>
    </div>
  );
}

export default SearchBar;
