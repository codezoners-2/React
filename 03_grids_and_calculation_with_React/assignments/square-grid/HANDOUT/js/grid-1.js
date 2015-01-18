/** @jsx React.DOM */

/* Grid 1: array of components, everything done in render(). */

var MyButton = React.createClass({
    render: function () {
        return <span><button onClick={this.props.onClick} type="button">{this.props.title}</button></span>;
    }
});

var Grid = React.createClass({
    handleClick: function (d) {
        alert(d);
    },

    render: function() {
        cells = [];
        for (var i = 1; i <= 20; i++) {
            // Some JS magic from:
            // http://facebook.github.io/react/tips/expose-component-functions.html
            var boundClick = this.handleClick.bind(this, i);
            cells.push(<MyButton onClick={boundClick} key={i} title={i} />);
        }

        return <div>{cells}</div>;
    }
});

var mountedContent = React.renderComponent(<Grid />,
                                           document.getElementById("container"));
