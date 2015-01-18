var Grid = React.createClass({
    render: function() {
        var makeButton = function (i) {
            return <MyButton key={i} title={i} />;
        };

        return <div>{_.range(1, 10).map(makeButton)}</div>;
    }
});
