render: function () {
    return <div>
        <div>{this.state.date}</div>
        <div><button type="button" onClick={this.handleClick}>Update!</button></div>
    </div>;
}
