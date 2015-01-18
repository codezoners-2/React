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
