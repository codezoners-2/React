/** @jsx React.DOM */

function randInt(from, to) {
    return Math.floor(Math.random() * (to - from + 1)) + from;
}

var MyBox = React.createClass({
    render: function() {
        // TODO: render a box with random colour, width, height, border, indentation:
        return <div />;
    }
});

var MyBoxes = React.createClass({
    getInitialState: function() {
        return {contents: [ ]};
    },

    addBox: function() {
        // TODO: add a new box to the MyBoxes component:
    },

    render: function() {
        // TODO: render the stack of boxes and the button:
        return <div />;
    }
});

React.renderComponent(
    <MyBoxes />,
    document.getElementById('container')
);
