/** @jsx React.DOM */

/* Grid 2: array of components, everything done in render(). */

var MyButton = React.createClass({
    render: function () {
        return <span><button type="button">{this.props.title}</button></span>;
    }
});

var Grid = React.createClass({
    render: function() {
        var makeButton = function (i) {
            return <MyButton key={i} title={i} />;
        };

        return <div>{_.range(1, 10).map(makeButton, this)}</div>;
    }
});

React.renderComponent(<Grid />,
                      document.getElementById("container"));
