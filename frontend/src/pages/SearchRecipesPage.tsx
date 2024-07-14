
const SearchRecipesPage: React.FC = () => {
    return (
        <div className="min-h-screen flex">
            {/** Search sidebar */}
            <div className="bg-primary min-h-screen flex flex-col md:w-1/4 w-full">
                <div className="bg-secondary p-4">
                    <form>
                        <input type="text" placeholder="Search recipes here" className="px-4 py-2 w-full rounded-lg text-white placeholder-gray-50 focus:outline-none bg-secondary border-tertiary border" />
                    </form>
                    <h2 className="mt-2">
                        Results
                    </h2>
                </div>
            </div>
        </div>
    )
}

export default SearchRecipesPage;