const HomePage: React.FC = () => {
    return (
      <div className="min-h-screen bg-yellow-50 flex flex-col">
        <header className="flex justify-between items-center p-6 bg-yellow-50">
          <h1 className="text-3xl font-bold text-gray-900">Gourmet Delights</h1>
          <nav>
            <a href="#" className="text-gray-900 hover:text-gray-700">Search</a>
          </nav>
        </header>
        <main className="flex-grow flex flex-col items-center text-center p-6 bg-yellow-50">
          <div className="max-w-md mx-auto">
            <div className="mb-8">
              <div className="relative inline-block">
                <div className="absolute inset-0 bg-orange-400 rounded-full h-16 w-16"></div>
                <h2 className="relative text-4xl font-bold text-gray-900 ml-20">Gourmet Delights</h2>
              </div>
              <p className="text-gray-700 mt-4">
                Discover a variety of recipes that cater to all tastes and occasions. From quick weeknight dinners to elaborate holiday feasts, we have something for everyone. Browse through our categories:
              </p>
            </div>
            <div className="relative">
              <input type="text" placeholder="Search here" className="px-4 py-2 border border-gray-300 rounded-full focus:outline-none" />
              <button className="absolute right-0 top-0 h-full px-4 bg-orange-400 text-white font-bold rounded-full">Search</button>
            </div>
          </div>
          <div className="flex-grow">
            <img src="/home-splash-image.jpeg" alt="Delicious food" className="max-w-full h-auto mt-8 rounded-lg shadow-md" />
          </div>
        </main>
      </div>
    );
  }
  
  export default HomePage;