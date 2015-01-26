(render :theme :sky
        :title "React"
        :author "Nick Rothwell"

        :slides [[:section
                  (heading "Grids and Calculation with React")
                  (subheading "Nick Rothwell")

                  (image-h 300 "calculator.png")
                  ]

                 [:section
                  [:section
                   (heading "Components and Subcomponents")
                   (subheading "Static Children")

                   (include-code "myboxes-def.js")
                   (include-code "myboxes.js")]

                  [:section
                   (subheading "Dynamic Children")

                   (include-code "boxes-getInitialState.js")
                   (include-code "boxes-addBox.js")
                   (include-code "contents-render.js")
                   ]

                  [:section
                   (subheading "Static Generated Children")
                   (image "grid-225.png")
                   ]]

                 [:section
                  [:section
                   (subheading "Solution (1970s Style)")

                   (include-code "grid-for.js")

                   [:ul
                    [:li "Rather verbose"]
                    [:li "Side-effecting (mutating)"]]]

                  [:section
                   (subheading "Solution (2010s Style)")

                   (include-code "grid-map.js")

                   [:ul
                    [:li "Succinct"]
                    [:li "Declarative"]]
                   ]
                  ]

                 [:section
                  [:section
                   (heading "Functional Programming")

                   [:ul
                    [:li "Using " (tt "underscore.js") " (" (link "http://underscorejs.org/") ")"]
                    [:li "Using Javascript functionally (" (tt "a.map(...)") ")"]]]

                  [:section
                   [:ul
                    [:li (tt "_.range(...)") ": generate an array containing a range of numbers"]
                    [:li (tt "a.map(...)") ": map a function across an array (makes a new array)"]]]

                  [:section
                   (include-code "func-1.js")
                   (include-code "func-2.js")]

                  [:section
                   (subheading "Bonus: filtering")

                   [:ul
                    [:li (tt "a.filter(...)") ": filter an array using a function (makes a new array)"]]

                   (include-code "func-filter.js")]

                  [:section
                   [:p "We're using " (tt "map") " to build an array of React components"]

                   (include-code "grid-map.js")]
                  ]

                 [:section
                  [:section
                   (heading "Exercise 1")
                   (subheading "Square Grid")

                   [:p "We've provided the grid to draw a row of buttons."]
                   [:p "Can you make it draw a grid of buttons?"]]

                  [:section
                   (image "grid-225.png")

                   [:p "(Don't worry about what the buttons do - yet.)"]

                   [:p "(Source code "
                    (github "codezoners-2/React/tree/master/03_grids_and_calculation_with_React/assignments/square-grid/HANDOUT"
                            "here")
                    ".)"]]]

                 [:section
                  [:section
                   (heading "Functions for Filter and Map")

                   [:p "Define functions in declarations using " (tt "function") " keyword"]

                   (include-code "square-fn.js")

                   [:p "(Could be useful for " (tt "map") ".)"]

                   (include-code "odd-fn.js")

                   [:p "(Could be useful for " (tt "filter") ".)"]

                   [:p "Then:"]

                   (code "_.range(10).filter(oddNumber).map(square)")]

                  [:section
                   (subheading "Neat but Ugly: Function Expressions")

                   (code "_.range(10).map(function (x) { return x * x; })")

                   [:p "The part " (tt "function (x) { return x * x; }")
                    " is the function"]]]

                 [:section
                  [:section
                   (heading "Functions to generate React")

                   [:p "Functions can generate React components:"]

                   (include-code "fn-react.js")

                   [:p "These functions can be used in " (tt "map") ":"]

                   (code "_.range(10).map(makeButton)")]
                  ]

                 [:section
                  [:section
                   (heading "Examples")

                   (code "_.range(16).map(makeButton)")
                   (image-h 300 "sixteenButtons.png")

                   ]

                  [:section
                   (include-code "makeRed.js")
                   (code "_.range(16).map(makeRed)")

                   (image-h 300 "sixteenReds.png")
                   ]

                  [:section
                   (include-code "sinMono.js")
                   (code "_.range(1000).map(sinMonoFn)")

                   (image-h 200 "sinsMono.png")
                   ]]

                 [:section
                  [:section
                   (heading "Exercise 1&frac12;")

                   [:p "Given these:"]

                   (image-h 300 "fns-handout.png")

                   [:p "("
                    (github "codezoners-2/React/tree/master/03_grids_and_calculation_with_React/assignments/functions/HANDOUT"
                            "download")
                    ")"]
                   ]

                  [:section
                   [:p "Can you make these?"]

                   (image  "worked-1.png")

                   ]

                  [:section
                   [:p "How about these?"]

                   (image "worked-2.png")]
                  ]

                 ;; Thoughts:

                 ;; Illustrate sin(): range() in node. Perhaps show image
                 ;; http://en.wikipedia.org/wiki/Trigonometry

                 ;; Ways of changing rate: multiply in mapped fn (as we've done)
                 ;; vs. filter (Kwesi) vs. _.range() with step, vs. map to
                 ;; multiply. Maybe look at bind().

                 [:section
                  [:section
                   (heading "React Trickiness")

                   [:p "How can an inner component affect an outer one?"]
                   [:p "(For example: buttons which can remove themselves from a collection.)"]]

                  [:section
                   (subheading "Part 1")
                   [:p "The button needs an " (tt "onClick") " handler"]

                   (include-code "button-onclick.js")
                   ]

                  [:section
                   (subheading "Part 2")

                   [:p "When we make a button, we have to create the " (tt "onClick") " function for it"]

                   (include-code "make-onclick.js")]

                  [:section
                   (subheading "Tricky... But Done")

                   [:p "That's a complete example."]
                   [:p "(But it's contrived: we don't need " (tt "handleClick") " in the grid.)"]

                   [:p "(Complete code "
                    (github "codezoners-2/React/tree/master/03_grids_and_calculation_with_React/assignments/generated-grid/HANDOUT"
                            "here")
                    ".)"]]]

                 [:section
                  [:section
                   (heading "Exercise 2")
                   (subheading "Self-Removing Buttons")

                   [:p "Modify this example so that the buttons remove themselves from the row."]

                   [:p "Method:"]

                   [:ul
                    [:li "The row of buttons can't be built inside " (tt "render")
                     "; it must be part of the " (tt "state") " of the grid"]
                    [:li "The " (tt "handleClick") " function must remove the button from the state"
                     " (using " (tt "setState") ", as in the earlier exercises)"]]]]

                 ]

        ;; Background: RPN calculators.
        ;; Basics: calculator, buttons, result stack.
        ;; Separation: components (JSX) vs. logic and (jQuery) callbacks. (Towards unit testing.)
        ;; Overview of structure. React, plain JS, jQuery.

        ;; Exercise: basic calculator (purely in React).

        ;; Exercise: assembly.


        )
