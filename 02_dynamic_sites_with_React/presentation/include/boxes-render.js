render: function() {
    return <div>
        <div>{this.state.contents}</div>
        <div><button type="button" onClick={this.addBox}>Add a box</button></div>
    </div>;
}
