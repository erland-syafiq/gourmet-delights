import { useLocation, Link } from "react-router-dom";

const Navbar: React.FC = () => {

    const location = useLocation();
    console.log(location);
    
    // Stops render in home page, let home page deal with rendering
    if (location.pathname === "/") {
        return <div></div>
    }

    return (
        <header className="bg-accent-1 px-20 py-3 border-black border-b">
            <nav className="flex justify-between">
                <Link to="/"><h2>Gourmet Delights</h2></Link>
                <Link to="/"><h2>Search</h2></Link>
            </nav>
        </header>
    )
}

export default Navbar;