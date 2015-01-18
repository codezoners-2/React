var Grid = React.createClass({
    render: function() {
        cells = [];
        for (var i = 1; i <= 20; i++) {
            cells.push(<MyButton key={i} title={i} />);
        }

        return <div>{cells}</div>;
    }
});
