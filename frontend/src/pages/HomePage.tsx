import { Link } from "react-router-dom";

const HomePage: React.FC = () => {
    return (
      <div className="min-h-screen flex flex-col bg-home bg-cover bg-no-repeat bg-bottom-left">
        <header className="bg-transparent flex justify-start items-center p-6">
          <h2 className="text-gray-900">Gourmet Delights</h2>
          <nav className="ms-20">
          <Link to="/search" className="text-gray-900 hover:text-gray-700">Search</Link>
          </nav>
        </header>
        <main className="ps-20 flex flex-1 flex-col justify-center max-w-lg">
            <div className="mb-8">
              <div className="relative inline-block">
                <div className="absolute -translate-y-9 bg-orange-400 rounded-full h-16 w-24"></div>
                <h1 className="relative text-gray-900">Gourmet Delights</h1>
              </div>
              <p className="mt-4">
                Discover a variety of recipes that cater to all tastes and occasions. From quick weeknight dinners to elaborate holiday feasts, we have something for everyone. Browse through our categories:
              </p>
            </div>
            <h2>
              Search for Recipes
            </h2>
            <form className="relative inline-block mt-2">
              <input type="text" placeholder="Search recipes here" className="px-4 py-2 rounded-lg text-white placeholder-white focus:outline-none bg-secondary border-tertiary border" />
              <button className="absolute right-0 top-0 px-4 py-2 bg-secondary text-white rounded-lg border-tertiary border">Search</button>
            </form>
        </main>
      </div>
    );
  }
  
  export default HomePage;