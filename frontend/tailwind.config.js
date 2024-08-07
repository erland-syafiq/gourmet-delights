/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        primary: "#FAF0CA",
        secondary: "#EE964B",
        tertiary: "#0D3B66",
        accent: "F95738",
      },
      backgroundImage: {
        home: 'url(/img/home.jpg)'
      }
    },
  },
  plugins: [],
}

