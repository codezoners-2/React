/** @jsx React.DOM */

var MyDate = React.createClass({
    getInitialState: function () {
        return {date: Date()};
    },

    render: function () {
        return <div>{this.state.date}</div>
    }
});
