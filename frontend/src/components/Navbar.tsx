
const Navbar: React.FC = () => {
    console.log(window.location.href);
    if (window.location.pathname === "/") {
        return <div></div>
    }

    return (
        <header className="bg-transparent flex justify-start items-center p-6">
            <h2 className="text-gray-900">Gourmet Delights</h2>
            <nav className="ms-20">
            <a href="#" className="text-gray-900 hover:text-gray-700">Search</a>
            </nav>
        </header>
    )
}

export default Navbar;