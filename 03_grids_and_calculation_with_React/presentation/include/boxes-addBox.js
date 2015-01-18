addBox: function() {
    var c = this.state.contents;
    c.push(<MyBox /* .... */ />);
    this.setState({contents: c});
}
