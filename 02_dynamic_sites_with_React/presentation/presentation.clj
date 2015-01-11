(render :theme :sky
        :title "React"
        :author "Nick Rothwell"

        :slides [[:section
                  (heading "Dynamic Sites with React")
                  (subheading "Nick Rothwell")]

                 [:section
                  [:section
                   (heading "Components and Properties")

                   [:ul
                    [:li "React components can be reused"]
                    [:li "React components can have properties"]]

                   (include-code "name-component.js")

                   (code "<NameBanner name=\"Fred\" />")
                   (code "<NameBanner name=\"Sally\" />")

                   ]

                  [:section
                   (include-code "mybox.js")

                   (code "<MyBox brightness=\"0\" />")
                   (code "<MyBox brightness=\"128\" />")
                   (code "<MyBox brightness=\"255\" />")]

                  [:section
                   (image "red-boxes.png")]]

                 [:section
                  [:section
                   (heading "Components and Children")

                   [:ul
                    [:li "React components can have child components"]]

                   (include-code "myboxes.js")]

                  [:section
                   [:ul
                    [:li "The children appear as an array called " (tt "this.props.children")]]

                   (include-code "myboxes-def.js")]]

                 [:section
                  [:section
                   (heading "Exercise 1")
                   (subheading "Red Boxes and Ugly Boxes")

                   [:p "Implement the stack of red boxes"]
                   (image-h 300 "red-boxes.png")]

                  [:section
                   (subheading "Tasks")

                   [:ul
                    [:li "Copy and paste the code for " (tt "MyBox") " and " (tt "MyBoxes")]
                    [:li "Write (or re-use) an HTML document to house " (tt "MyBoxes")]
                    [:li "(You'll need to render the main component into a container in the document)"]]]

                  [:section
                   (subheading "Exercise 1a")

                   (image-h 300 "ugly-boxes.png")

                   [:p "Alter the " (tt "MyBox")
                    " component so that you can set the (RGB) colour, width and height as properties"]]

                  [:section
                   (subheading "Exercise 1b")

                   (image-h 200 "indented-boxes.png")

                   [:p "Add some more variety: variable border and indentation"]]]

                 [:section
                  [:section
                   (heading "Subcomponents and State")

                   [:p "We can use a component's " [:strong "state"]
                    " to hold its 'children'"]

                   [:ul
                    [:li "Initialise the children in " (tt "getInitialState")]
                    [:li "Render the children in " (tt "render")]]]

                  [:section
                   (include-code "contents-initial.js")
                   (include-code "contents-render.js")]

                  [:section
                   (subheading "Why Bother?")

                   [:p "The children can be modified dynamically!"]

                   (image "random-boxes.png")]]

                 [:section
                  [:section
                   (heading "Implementing 'Add'")

                   [:ul [:li "Start with no children"]]

                   (include-code "boxes-getInitialState.js")

                   [:ul [:li "Render a component with a button"]]

                   (include-code "boxes-render.js")

                   ]

                  [:section
                   [:ul [:li "The magic: push a subcomponent"]]

                   (include-code "boxes-addBox.js")]
                  ]

                 [:section
                  [:section
                   (heading "Exercise 2")
                   (subheading "Stack of Random Boxes")

                   [:p "Implement the random box stack, starting with the code "
                    (github "codezoners-2/React/tree/master/02_dynamic_sites_with_React/assignments/random-boxes/HANDOUT"
                            "here")
                    "."]

                   [:ul
                    [:li "Implement (or copy) the code for " (tt "MyBox")]
                    [:li "Randomise the colour, width, height, border, indentation (there's a "
                     (tt "randInt") " function provided to help"]
                    [:li "Implement " (tt "addBox") " to add a box to the state of " (tt "MyBoxes")]
                    [:li "Implement the renderer for " (tt "MyBoxes")]]]

                  [:section
                   (subheading "Exercise 2a")

                   [:ul
                    [:li "Can you implement a " (tt "clear") " button to reset the display?"]
                    [:li "How about a " (tt "pop") " button to remove the last box added?"]
                    [:li "(Neither button should appear when there are no boxes shown)"]]]
                  ]])
