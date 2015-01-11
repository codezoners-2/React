var MyBox = React.createClass({
    render: function() {
        return <div style={{backgroundColor: 'rgb('+this.props.brightness+', 0, 0)',
                            width: "100px",
                            height: "50px"}} />;
    }
});
