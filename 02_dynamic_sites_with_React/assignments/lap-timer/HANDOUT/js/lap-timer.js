/** @jsx React.DOM */

/** Timer (stopwatch) with component-based lap timing. */

// http://stackoverflow.com/questions/6312993/javascript-seconds-to-time-string-with-format-hhmmss
function display(msec) {
    var sec = Math.floor(msec / 1000);
    var tenths = Math.floor((msec - (sec * 1000)) / 100);
    var hours   = Math.floor(sec / 3600);
    var minutes = Math.floor((sec - (hours * 3600)) / 60);
    var seconds = sec - (hours * 3600) - (minutes * 60);

    if (hours   < 10) {hours   = "0"+hours;}
    if (minutes < 10) {minutes = "0"+minutes;}
    if (seconds < 10) {seconds = "0"+seconds;}
    return hours + ':' + minutes + ':' + seconds + "." + tenths;
}

var Lap = React.createClass({
    render: function () {
        // TODO: This is the renderer for a single lap. What properties should it have?
        return <h2>
            <div className="row">
                <div className="col-xs-offset-1 col-xs-2">
                    <span className="label label-default">000</span>
                </div>
            </div>
        </h2>;
    }
});

var Timer = React.createClass({
    getInitialState: function () {
        return {laps: [ ],
                running: false,
                started: 0,
                elapsed: 0};
    },

    tick: function () {
        if (this.state.running) {
            this.setState({elapsed: Date.now() - this.state.started});
        }
    },

    componentDidMount: function() {
        this.interval = setInterval(this.tick, 100);
    },

    componentWillUnmount: function() {
        clearInterval(this.interval);
    },

    start: function() {
        this.setState({running: true, started: Date.now()});
    },

    stop: function() {
        this.setState({running: false});
    },

    lap: function() {
        // TODO: add a new lap to the existing set of laps? What value should it have?
    },

    render: function () {
        var glyphClass = (this.state.running ? "stop" : "play");
        var action = (this.state.running ? this.stop : this.start);
        var lab = (this.state.running ? "success" : "default");
        var lapper = (this.state.running
                      ? <button className="btn btn-default" onClick={this.lap}>
                            <span className="glyphicon glyphicon-plus-sign"></span>
                        </button>
                      : <span />);
        // TODO: render the laps (somehow...).
        return <div>
            <h1>
                <div className="row">
                    <div className="col-xs-1">
                        <button className="btn btn-default" onClick={action}>
                            <span className={"glyphicon glyphicon-" + glyphClass}></span>
                        </button>
                    </div>
                    <div className="col-xs-2">
                        <span className={"label label-" + lab}>{display(this.state.elapsed)}</span>
                    </div>
                    <div className="col-xs-1">{lapper}</div>
                </div>
            </h1>
        </div>;
    }
});

React.renderComponent(
    <Timer />,
    document.getElementById("container")
);
