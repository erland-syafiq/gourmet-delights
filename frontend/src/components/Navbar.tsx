import { useLocation, Link } from "react-router-dom";

const Navbar: React.FC = () => {

    const location = useLocation();
    console.log(location);
    
    // Stops render in home page, let home page deal with rendering
    if (location.pathname === "/") {
        return <div></div>
    }

    return (
        <header>
            <nav className="bg-accent-1 flex justify-between px-20 py-5">
                <Link to="/"><h2>Gourmet Delights</h2></Link>
                <Link to="/"><h2>Search</h2></Link>
            </nav>
        </header>
    )
}

export default Navbar;