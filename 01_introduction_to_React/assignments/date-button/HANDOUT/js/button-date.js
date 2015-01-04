/** @jsx React.DOM */

var MyDate = React.createClass({
    getInitialState: function () {
        return {date: new Date()};
    },

    render: function () {
        return <div>
            <div>{this.state.date}</div>
            <div><button type="button">Update!</button></div>
        </div>;
    }
});

React.renderComponent(
    <MyDate />,
    document.getElementById('target')
);
