import { Route, Routes, BrowserRouter } from 'react-router-dom';
import HomePage from './pages/HomePage';
import SearchRecipesPage from './pages/SearchRecipesPage';
import Navbar from './components/Navbar';

function App() {
  return (
    <BrowserRouter>
      <>
        <Navbar />
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="/search" element={<SearchRecipesPage />} />
        </Routes>
      </>
    </BrowserRouter>
  );
}

export default App;