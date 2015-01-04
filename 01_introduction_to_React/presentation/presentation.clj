(render :theme :sky
        :title "React"
        :author "Nick Rothwell"

        :slides [[:section
                  (heading "The React Framework")
                  (subheading "Nick Rothwell")]

                 [:section
                  (heading "What is React?")

                  [:ul
                   [:li "A framework for dynamic user interfaces on the web"]
                   [:li "Features:"]
                   [:ul
                    [:li "Clean dataflow from code to page"]
                    [:li "Supports structured data directly in code using XML"]]
                   ]
                  ]

                 [:section
                  (heading "Background: Javascript and the DOM")

                  [:ul
                   [:li "The " [:i "DOM"] " (Document Object Model) is the browser's internal"
                    " representation of a web page"]

                   [:li "Javascript code can alter the DOM, dynamically"]]]

                 [:section
                  [:section
                   (heading "Example 1: The Date")

                   [:p "This code will embed the date into a web page"]
                   (include-code "date-write.html")]

                  [:section
                   (image "date-write.png")]

                  [:section
                   (subheading "Issues")

                   [:p "The script runs once, when the page is loaded"]]
                  ]

                 [:section
                  [:section
                   (heading "Example 2: The Date using React")

                   (include-code "date-react.html")]

                  [:section
                   (image "date-react.png")]

                  [:section
                   (subheading "Issues")

                   [:p "Page is still static"]]
                  ]

                 [:section
                  [:section
                   (heading "React: The Essentials")]

                  [:section
                   (subheading "React and JSX from a CDN")

                   (code "<script src=\"http://fb.me/react-0.12.2.js\"></script>"
                         "<script src=\"http://fb.me/JSXTransformer-0.12.2.js\"></script>")
                   ]

                  [:section
                   (subheading "An anchor element to rewrite")

                   (code "<div id=\"example\">If you can see this, it's gone wrong!</div>")]

                  [:section
                   (subheading "Some JSX Scripting")

                   (include-code "date-react-jsx.html")
                   ]

                  [:section
                   (subheading "Things to Note")

                   [:ul
                    [:li "The script type is " (tt "text/jsx")]
                    [:li "The special comment " (tt "/** @jsx React.DOM */") " is needed"]
                    [:li "We can write a " (tt "<div>") " directly in the code"]
                    [:li "We get back into Javascript with braces (" (tt "{Date()}") ")"]]]

                  [:section
                   (subheading "(JSX is Rewritten into Javascript)")

                   (image "jsx-rewrite.png")]]

                 [:section
                  [:section
                   (heading "Exercise 0")
                   (subheading "'Printing' the Date")

                   (image-h 200 "static-date-h1.png")

                   [:p "Print the date into the heading"]

                   [:p "(Example code is "
                    (github "codezoners-2/React/tree/master/01_introduction_to_React/assignments/static-date/HANDOUT"
                            "here")
                    ".)"]]

                  [:section
                   (heading "Exercise &frac12;")
                   (subheading "(Trickier...)")

                   (image-h 100 "static-date-title.png")

                   [:p "Print the date into the page title"]]]

                 [:section
                  [:section
                   (heading "React Classes")

                   [:p "Build more complex interaction using React's class machinery"]

                   (include-code "react-classes-1.js")
                   (include-code "react-classes-1a.js")

                   ]

                  [:section
                   [:ul
                    [:li (tt "getInitialState") ": declare an initial state as a record of named values"]
                    [:li (tt "render") ": render the component using JS or JSX, referring to " (tt "this.state.XXX")]]]

                  [:section
                   (subheading "External Javascript/JSX")

                   (code " <script src=\"js/button-date.js\" type=\"text/jsx\"></script>")

                   [:p "You still need the " (tt "/** @jsx React.DOM */") " in the JS file"]
                   ]
                  ]

                 [:section
                  [:section
                   (heading "Adding Interaction")
                   (subheading "Refresh the date on button press")

                   (image-h 200 "date-button.png")]

                  [:section
                   [:p "Add a button to the " (tt "render") " method"]
                   (include-code "date-button-render.js")
                   [:p "Add a callback to update the object"]
                   (include-code "date-button-handleClick.js")
                   [:p "That's it!"]]]

                 [:section
                  [:section
                   (heading "Exercise 1")
                   (subheading "Implement a Date Refresh Button")

                   [:p "We've provided an outline of the button example "
                    (github "codezoners-2/React/tree/master/01_introduction_to_React/assignments/date-button/HANDOUT"
                            "here")
                    ". Can you make it work?"]]]

                 [:section
                  [:section
                   (heading "Interval Timers")
                   (subheading "Periodic 'Background' Tasks")

                   [:ul
                    [:li "We can set tasks (functions) to call periodically"]
                    [:li "Tasks have to be set and cleared"]]]

                  [:section
                   (subheading "Create a function to call periodically")

                   (include-code "tick.js")

                   [:p "(The function can have any name; " (tt "tick") " seems an obvious choice.)"]]

                  [:section
                   (subheading "Set and clear interval timer")

                   (include-code "mount-unmount.js")

                   [:p "(The names " (tt "componentDidMount") " and "
                    (tt "componentWillUnmount") " are specified by React.)"]]]

                 [:section
                  [:section
                   (heading "Exercise 2")
                   (subheading "Implement This Auto-Update")

                   [:ul
                    [:li "The HTML file doesn't need to change"]
                    [:li "The React component doesn't need a button"]]]]

                 [:section
                  [:section
                   (heading "Fun with Dates and Times")

                   [:p "Javascript provides date and time methods"]
                   [:p "(" (link "http://www.w3schools.com/js/js_date_methods.asp") ")"]]

                  [:section
                   (subheading "Danger Will Robinson!")

                   [:p "JavaScript Hell"]

                   [:ul
                    [:li "The date function (" (tt "Date()") ") returns a string"]
                    [:li "The date constructor (" (tt "new Date()") ") returns"
                     " an object with date calculation methods"]]]

                  [:section
                   (subheading "Date Function")
                   (include-code "date-fun.js")

                   (subheading "Date Constructor")
                   (include-code "date-ctr.js")

                   [:p "More info: " (link "https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date")]
                   ]]

                 [:section
                  [:section
                   (heading "Exercise 3")
                   (subheading "Digital Clock")

                   [:p "Use the Date object and methods to implement a digital clock"]

                   (image-h 200 "clock-time.png")

                   [:p "We're using Bootstrap for the grid layout and coloured labels."]

                   [:p "Outline of the code "
                    (github "codezoners-2/React/tree/master/01_introduction_to_React/assignments/clock/HANDOUT"
                            "here")
                    "."]]

                  [:section
                   (subheading "A Better Clock")

                   [:p "Can you add day and date display?"]

                   (image-h 200 "clock-time-date.png")

                   [:p "(How can you generate the day and month names?)"]]]

                 ;; Later topics/exercises:
                 ;; Stuff with date calculations (age, time to Xmas, ...)
                 ;; Altering content (grey-selector panels)
                 ;; Dynamic content (adding buttons; maybe adding panels as well)
                 ;; Design project: dynamic calendar
                 ])
