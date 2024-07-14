const HomePage: React.FC = () => {
    return (
      <div className="min-h-screen flex flex-col bg-home bg-cover bg-no-repeat">
        <header className="flex justify-start items-center p-6">
          <h2 className="text-gray-900">Gourmet Delights</h2>
          <nav className="ms-20">
            <a href="#" className="text-gray-900 hover:text-gray-700">Search</a>
          </nav>
        </header>
        <main className="ps-20 flex flex-1 flex-col justify-center max-w-lg">
            <div className="mb-8">
              <div className="relative inline-block">
                <div className="absolute inset-0 bg-orange-400 rounded-full h-16 w-16"></div>
                <h1 className="relative text-gray-900 ml-20">Gourmet Delights</h1>
              </div>
              <p className="text-gray-700 mt-4">
                Discover a variety of recipes that cater to all tastes and occasions. From quick weeknight dinners to elaborate holiday feasts, we have something for everyone. Browse through our categories:
              </p>
            </div>
            <div className="relative inline-block">
              <input type="text" placeholder="Search recipes here" className="px-4 py-2 rounded-lg text-white placeholder-white focus:outline-none bg-secondary border-tertiary border" />
              <button className="absolute right-0 top-0 h-full px-4 bg-orange-400 text-white rounded-lg">Search</button>
            </div>
        </main>
      </div>
    );
  }
  
  export default HomePage;