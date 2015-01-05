/** @jsx React.DOM */

/** Timer (stopwatch). Optional: lap timing. */

var Timer = React.createClass({
    getInitialState: function () {
        // What state is needed here?
        return { };
    },

    tick: function () {
        // What happens when tick is called?
    },

    componentDidMount: function() {
        // Set the interval timer to call tick. How often should this happen?
    },

    componentWillUnmount: function() {
        // Cancel the timer.
    },

    start: function() {
        // Change the state of the component.
    },

    stop: function() {
        // Change the state of the component.
    },

    render: function () {
        return <h1><div className="row">
            <div className="col-xs-offset-1 col-xs-1">
                <button type="button" className="btn btn-default" onClick={this.start}>Start</button>
            </div>
            <div className="col-xs-1">
                <button type="button" className="btn btn-default" onClick={this.stop}>Stop</button>
            </div>
            <div className="col-xs-1"><span className="label label-default">0</span></div>
        </div></h1>;
    }
});

React.renderComponent(
    <Timer />,
    document.getElementById('container')
);
