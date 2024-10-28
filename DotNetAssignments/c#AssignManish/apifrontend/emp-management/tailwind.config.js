/** @type {import('tailwindcss').Config} */
export default {
  content: ["./src/**/*.{html,js,jsx}"],
  theme: {
    extend: {
      clipPath: {
        'cross-cut': 'polygon(0% 0%, 90% 10%, 100% 100%, 10% 90%)',
      },
    },
  },
  plugins: [
    function({ addUtilities, theme }) {
      const clipPathUtilities = theme('clipPath');
      const clipPathUtilitiesClasses = Object.keys(clipPathUtilities).map(key => {
        return {
          [`.clip-path-${key}`]: {
            clipPath: clipPathUtilities[key],
          },
        };
      });

      addUtilities(clipPathUtilitiesClasses, ['responsive', 'hover']);
    },
  ],
}