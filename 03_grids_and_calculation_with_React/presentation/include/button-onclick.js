var MyButton = React.createClass({
    render: function () {
        return <span><button onClick={this.props.onClick} type="button">{this.props.title}</button></span>;
    }
});
