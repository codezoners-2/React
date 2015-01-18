/** @jsx React.DOM */

/* Grid 2: array of components, everything done in render(). */

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
        var makeButton = function (i) {
            var boundClick = this.handleClick.bind(this, i);
            return <MyButton onClick={boundClick} key={i} title={i} />;
        };

        return <div>{_.range(1, 10).map(makeButton, this)}</div>;
    }
});

var mountedContent = React.renderComponent(<Grid />,
                                           document.getElementById("container"));
