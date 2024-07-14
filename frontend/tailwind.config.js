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
        "accent-0": "#F95738",
        "accent-1": "#F4D35E"
      },
      backgroundImage: {
        home: 'url(/img/home.jpg)'
      }
    },
  },
  plugins: [],
}

